


size = []
parent = []

def find(p):
    if parent[p] == p:
        return p
    else:
        parent[p] = find(parent[p]) #path compression
        return parent[p]

def query(p, q):
    rootP = find(p)
    rootQ = find(q)
    if rootP == rootQ:
        print(1)
    else: print(0)


def union(p,q):
    rootP = find(p)
    rootQ = find(q)
    if rootP == rootQ:
        return
    elif size[rootP] <= size[rootQ]:
        parent[rootP] = rootQ
        size[rootQ] += size[rootP]
    else: 
        parent[rootQ] = rootP
        size[rootP] += size[rootQ]
        
        
def move(p,q):
    rootP = find(p)
    rootQ = find(q)
    if rootP == rootQ:
        return
    else: 
        parent[p] = rootQ
        size[rootP] -= 1
        size[rootQ] += 1
        
n,m = input().split(" ")
n = int(n)
m = int(m)
parent = [i+n for i in range(n)] + [i+n for i in range(n)]
size = [1 for _ in range(n)] + [1 for _ in range(n)]
while m > 0:
    op,p,q = input().split(" ")
    if op == '0':
        query(int(p),int(q))
    elif op == '1':
        union(int(p),int(q))
    else:
        move(int(p),int(q))    
    m -= 1


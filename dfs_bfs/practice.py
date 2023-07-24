# Define the graph as an adjacency list
graph = {
  'A' : ['B','C'],
  'B' : ['D'],
  'C' : ['E','F'],
  'D' : [],
  'E' : [],
  'F' : []
}

visited = []

def dfs(graph, visited, node):
    if node not in visited:
        visited.append(node)

        print(node, end = " ")

        for n in graph[node]:
            dfs(graph, visited, n)

queue = []
def bfs(graph, visited, node):
    visited.append(node)
    queue.append(node)

    while queue:
        s = queue.pop(0)
        print(s, end = " ")

        for n in graph[s]:
            if n not in visited:
                visited.append(n)
                queue.append(n)
        


print("DFS:")
dfs(graph, visited, 'A')

visited.clear()
print()

print("BFS:")
bfs(graph, visited, 'A')

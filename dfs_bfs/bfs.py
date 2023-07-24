# Define the graph as an adjacency list
graph = {
  'A' : ['B','C'],
  'B' : ['D'],
  'C' : ['E','F'],
  'D' : [],
  'E' : [],
  'F' : []
}

# List to keep track of nodes that we have visited
visited = [] 

# Initialize a queue data structure
queue = [] 

def bfs(visited, graph, node):
  # We mark the node as visited by appending to visited list
  visited.append(node)

  # We add the same node to the queue
  queue.append(node)

  # As long as there are elements in the queue
  while queue: 

    # We pop the element at the front of the queue
    s = queue.pop(0)  

    # Print it out as part of our BFS
    print (s, end = " ")  

    # We loop through the neighbors of the current node
    for neighbour in graph[s]: 

      # If the neighbor has not been visited
      if neighbour not in visited:

        # We mark it as visited
        visited.append(neighbour)  

        # And add it to the queue for future processing
        queue.append(neighbour)  

# Driver Code
# Call the BFS function
bfs(visited, graph, 'A')  

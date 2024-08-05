import numpy as np

def fibonacci_matrix(n):
    if n <= 0:
        return 0
    elif n == 1:
        return 1

    # Define the base matrix
    base_matrix = np.array([[1, 1], [1, 0]])
    #[[1,1],[1,0]]

    # Perform matrix exponentiation
    result_matrix = np.linalg.matrix_power(base_matrix, n - 1)

    # Extract the Fibonacci number from the result matrix
    return result_matrix[0][0]

# Test the function
n = 4
print(f"Fibonacci({n}) =", fibonacci_matrix(4))
result_matrix = np.linalg.matrix_power(np.array([[1, 1], [1, 0]]), 2)
print(result_matrix)


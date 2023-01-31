# import numpy as np
# import sympy as sp
# from scipy import linalg

# Vec = np.matrix([[1,1,1,5],
#                  [1,2,0,3],
#                  [2,1,3,12]]) 

# Vec_rref =sp.Matrix(Vec).echelon_form()

# print(Vec_rref)


import numpy as np

def parametric_form(A, b):
    Ab = np.hstack([A, b.reshape(-1, 1)])
    n = Ab.shape[1] - 1
    rref, pivots = np.linalg.qr(Ab)[1][:, :n], []
    for i, row in enumerate(rref):
        pivot = (i, np.argmax(np.abs(row)))
        if pivot[1] == n:
            return None
        pivots.append(pivot)
        rref[i] = np.roll(row, -pivot[1])
        rref[i, -1] /= rref[i, pivot[1]]
        rref[i, pivot[1]] = 1
        for j in range(rref.shape[0]):
            if i == j:
                continue
            rref[j] -= rref[j, pivot[1]] * rref[i]
    x = np.zeros((n, 1))
    free = np.setdiff1d(np.arange(n), [p[1] for p in pivots])
    for i, pivot in enumerate(pivots):
        x[pivot[1]] = rref[i, -1]
    return x, free

A = np.array([[1, 2, 3], [4, 5, 6], [7, 8, 9]])
b = np.array([1, 2, 3])

x, free = parametric_form(A, b)
if x is None:
    print("The system has no solution.")
else:
    print("The parametric form of the solution is:")
    for i in range(x.shape[0]):
        if i in free:
            print(f"x_{i+1} = {x[i][0]}t")
        else:
            print(f"x_{i+1} = {x[i][0]}")


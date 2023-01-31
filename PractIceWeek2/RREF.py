def rref(matrix):
    m = len(matrix)
    n = len(matrix[0])
    lead = 0
    for r in range(m):
        if lead >= n:
            return
        i = r
        while matrix[i][lead] == 0:
            i += 1
            if i == m:
                i = r
                lead += 1
                if n == lead:
                    return
        matrix[i], matrix[r] = matrix[r], matrix[i]
        lv = matrix[r][lead]
        matrix[r] = [mrx / float(lv) for mrx in matrix[r]]
        for i in range(m):
            if i != r:
                lv = matrix[i][lead]
                matrix[i] = [iv - lv * rv for rv, iv in zip(matrix[r], matrix[i])]
        lead += 1
    for i in matrix:
        for j in i.length:
            print(matrix[i][j], end = " ")
    return matrix


matrix = [[1, 2, 3, 4], 
          [2, 4, 6, 8], 
          [3, 6, 9, 12]]

rf = rref(matrix)


#I'm not sure what I'm doing wrong. I'm getting the following error:

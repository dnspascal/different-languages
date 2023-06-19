import numpy as np
import pandas as pd

data = [15, 16, 18, 19, 22, 24, 29, 30, 34]
print("mean:", np.mean(data))
print("median:", np.median(data))
print("50th percentile(median):", np.percentile(data, 50))
print('25th percentile(median):', np.percentile(data, 25))
print("75th percentile(median):", np.percentile(data, 75))
print("Standard deviation:", np.std(data))
print("variance:", np.var(data))


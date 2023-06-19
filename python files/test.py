

import matplotlib.pyplot as plt
from mpl_helper_2 import initialize_plot
import numpy as np
figure, axes = initialize_plot('x', 'y', "y = sin(x)")
# set the aspect ratio of vertical to horizontal
axes.set_aspect('equal')
# --------------------------------------------------------------
# show x-coordinates from -7 to 7
axes.set_xlim([-7, 7])
# show y-coordinates from -7 to 7
axes.set_ylim([-7, 7])
# --------------------------------------------------------------
# Generate 1000 equally spaced points between -2 pi and 2 pi
x_values = np.linspace(-2 * np.pi, 2 * np.pi, 1000)
the_plot = plt.plot(x_values, np.sin(x_values))
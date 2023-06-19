import pandas as pd

df = pd.read_csv('titanic.csv')
#print(df.head()
#print(df.describe())

col = df.columns[1]
#col=df.columns.astype('Fare')
#(df.columns == df.columns.astype(str)
#small_df=df['Fare'].to_string(index=False)
print(col)
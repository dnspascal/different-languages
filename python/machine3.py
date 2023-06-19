import pandas as pd
import numpy as np

exam_data = {'name':['Denis','Francis','Hance','Prosper','Davis'],
 'score':[90,91,92,93,94,],
 'attempts':[1,2,3,4,5],
 'qualify':['yes','yes','yes','yes','yes']

}

labels=['a','b','c','d','e']
df=pd.DataFrame(exam_data,index=labels)
df1=pd.read_csv('titanic.csv')

#df2=pd.DataFrame(df1)

#print(df2)
print(df)

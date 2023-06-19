year=[2000,2001,2002,2003,2004,2005,2006,2007,2008,2009,2010]
x=len(year)
print(x,'\t',year[0],'\t',year[-1],'\t',year[2:4])
#extend() function is used to add new members within the list
year.extend([2011,2012,2013,2014,2015,2016,2017,2018,2019,2020,2021,2022])
print(len(year))
print(year[13:18])
#The append() function is used to place new item at the end of the list
year.append([2023,2024])
print(len(year),'\n',year[23])
#the insert() function is used to insert the data at specific index
year.insert(0,1999)
print(year,'\t',len(year))
#The pop() function is usd to remove the item at the specific idex
year.pop(8)
print(year,len(year)) 
#if you use pop() with no index it remove the last item
print(year.pop())

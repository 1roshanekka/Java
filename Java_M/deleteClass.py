import os

path = os.listdir()

print('This directory is : ', os.getcwd())
print('deleting class files ...')

count = 0
for each in path:
    if each.endswith(".class"):
        count += 1
        os.remove(each)
print('deleted' , count , 'files')
print('done')
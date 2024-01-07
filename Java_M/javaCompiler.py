import os 

path = os.listdir()

for each in path:
    if(each.endswith('.java')):
        compiler = 'javac'
        file = each # not necessary but for simplicity
        command = f'{compiler} {file}'
        # print(command)
        
        try:
            os.system(command)
        except:
            print('please check java code for ', file)
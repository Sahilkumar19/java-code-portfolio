#!/bin/sh
echo "what is your name"
read PERSON
echo "hello, $PERSON"
myVar=Hello
name=Sitare
echo $myVar $name

start=$(date +%s)
myVar=Hello
name=Sitare
sleep 1
echo $myVar $name
end=$(date +%s)
echo "Time required is: $((end-start)) seconds"

#Output:
#Hello Sitare
#Time required is: 5 seconds

m=1
n=2
if [ $n -eq $m ]
then
echo "Both variables are the same"
else
echo "Both variables are different"
fi

#Output:
#Both variables are different

a=0
# lt is less than operator
#Iterate the loop until a less than 10
while [ $a -lt 10 ]
do
# Print the values
echo $a
# increment the value
a=`expr $a + 1`
done

#Output:
#0
#1
#2
#3
#4
#5
#6
#7
#8
#9

for var in 0 1 2 3 4 5 6 7 8 9
do
echo $var
done

max=10
for i in `seq 1 $max`
do
echo "$i"
done

for FILE in /home/vboxuser/AJP/code/java/*
do
echo "File or folder name with path: $FILE"
echo "Only file or folder name: $(basename $FILE)"
done
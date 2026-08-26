#!/usr/bin/env bash
start=$(date +%s%N)
var=hello
name=sitare
sleep 1
echo $var $name
end=$(date +%s%N)
echo $((end-start))

m=1
n=2

if [ $n -eq $m ]
  then
   echo 'both variable are same'
else
  echo "both are different"
fi

string1="Hello"
string2="Hello"

if [ "$string1" == "$string2" ]; then
    echo "Strings are equal."
else
    echo "Strings are not equal."
fi
counter=1

while [ $counter -le 5 ]; do
    echo "Number: $counter"
    ((counter++))
done
max=10
for i in `seq 1 $max` ; do
  echo "$i"

done


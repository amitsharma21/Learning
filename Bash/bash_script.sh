#! /bin/bash

read -p "do you like programming? " ans
case $ans in
	Yes|yes|y|Y)
		echo "yohooo he likes programming"
		;;
	No|no|n|N)
		echo "oops he dont likes programming"
		;;
	*)
		echo "wrong input"
		;;
esac

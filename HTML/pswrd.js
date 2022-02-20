function show()
{
	x=document.getElementById('t2').value;

if(x.length<=4)
{
document.getElementById('s1').innerHTML="Weak";
document.getElementById('s1').style.color="red";
}
else if(x.length<=8)
{
document.getElementById('s1').innerHTML="good";
document.getElementById('s1').style.color="yellow";
}
else
{
document.getElementById('s1').innerHTML="Strong";
document.getElementById('s1').style.color="green";
}
}

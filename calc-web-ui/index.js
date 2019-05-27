


document.addEventListener("DOMContentLoaded",e=>{

    let btn=document.getElementById('go-btn');
    btn.addEventListener('click',e=>{
        let n1=document.getElementById('inp1').value;
        let n2=document.getElementById('inp2').value;
        let result=Number.parseInt(n1)+Number.parseInt(n2);
        document.getElementById('result').innerHTML=result;
    })

})
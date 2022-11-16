var Body = {
    setColor: function(color) {
        $('body').css('color', color);
 }
    //   document.querySelector('body').style.color = color;
   }
    setBackgroundColor: function(color) {
        $('body').css('backgroundcolor', color);
    //   document.querySelector('body').style.backgroundColor = color;
   }
   }
   
   var Links = {
    setColor: function(color) {
     var alist = document.querySelectorall('a');
     var i = 0;
     while(i < alist.length) {
     alist[i].style.color = color;
     i = i + 1;
     }
     }
     }
   
   
   
   function nightDayHandler(self) {
       var target = document.querySelector('body');
               if (self.value === 'night') {
                   //target.style.backgroundColor = 'black';
                   // BodySetBackgroudSetColor('black')
                   //target.style.color = 'white';
                   // BodySetColor('white')
                   body.setBackgroundColor('black')
                   body.setColor('white')
                   self.value = 'day'
                   // setColor('powerblue');
                        links.setColor('red')    
               }
                   else {
                   //target.style.backgroundColor = 'white';
                   // BodySetBackgroudSetColor('white')
                   //target.style.color = 'black';
                   // BodySetColor('black')
                   self.value = 'night'
                   // setColor('blue');
                   body.setBackgroundColor('white')
                   body.setColor('black')
                   links.setColor('blue') 
                       }
       
                   }
       
   
<template>
 <div  class=" mainDiv d-flex justify-content-center ">

  
<div class="row" >

  <div class="col align-self-center text-center">

 
 
  <div class="boxed ">

  <p class="p-1">Keeping track of your code is hard</p>
  <p class="p-2">We make it easy</p>
   <b-btn id="btn" variant="primary" class="routeLink" v-bind:to="{ name: 'examples-display' }" href="#" role="button">Explore</b-btn>
  <p class="p-3"> Store, edit, categorize your code snippets </p>
  <p class="p-4">Share with other users</p>


    
   
  
 
       </div>

 </div>
 </div>

       
</div>


</template>

<script>

export default {
  
    name: "home-page"
}
</script>

<style scope>





.p-1   {
  color: white;
  font-style: 'Roboto', sans-serif;
  font-weight: 500;
  font-size: 400%;
  
  text-align: center;
  text-shadow: 0px 0px 3px #000, -1px -1px #000, 1px 1px #000;
  
  
}
.p-2 {
    color: white;
  font-style: 'Roboto', sans-serif;
  font-weight: 500;
  font-size: 380%;
  text-align: center;
  text-shadow: 0px 0px 3px #000, -1px -1px #000, 1px 1px #000;
 
}

.p-3 {
    color: white;
  font-style: 'Roboto', sans-serif;
  font-weight: 500;
  font-size: 250%;
  text-align: center;
  text-shadow: 0px 0px 3px #000, -1px -1px #000, 1px 1px #000;
}

.p-4 {
    color: white;
  font-style: 'Roboto', sans-serif;
  font-weight: 500;
  font-size: 250%;
  text-align: center;
  text-shadow: 0px 0px 3px #000, -1px -1px #000, 1px 1px #000;
}
#btn {



font-size: 3em;
margin: .3em;

font-weight:bold;
text-shadow: 0px 0px 3px #000, -1px -1px #000, 1px 1px #000;
}

.mainDiv {
  height: 80vh
}

</style>
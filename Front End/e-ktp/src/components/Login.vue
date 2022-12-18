<template>
  <div id="bg">
    <div class="d-flex flex-center p-5">
      <div class="container-fluid h-custom p-5">
    <div class="row d-flex justify-content-center align-items-center h-100">
      <div class="col-md-9 col-lg-6 col-xl-5">
        <img id="pktp" src="../assets/ktpvector.png"
          class="img-fluid" alt="Sample image">
      </div>
      <div class="col-md-8 col-lg-6 col-xl-4 offset-xl-1">
        <form>
          <div class="border border-secondary p-2 rounded shadow" id="borderlogin">
            <h2 class="d-flex justify-content-center mb-5 mt-5 text-white">Selamat Datang !</h2>
          <!-- Email input -->
          <div class="form-outline mb-2 d-flex justify-content-center">
            <input type="email" id="formemaillogin" class="form-control form-control-lg col-sm-8 mb-3"
              placeholder="Email" />
            <label class="form-label" for="form3Example3"> </label>
          </div>

          <!-- Password input -->
          <div class="form-outline mb-2 d-flex justify-content-center">
            <input type="password" id="formemaillogin" class="form-control form-control-lg col-sm-8 "
              placeholder="Password" />
            <label class="form-label" for="form3Example4"> </label>
          </div>

          <!-- <div class="d-flex justify-content-between align-items-center"> -->
            <!-- Checkbox -->
            <!-- <div class="form-check mb-0">
              <input class="form-check-input me-2" type="checkbox" value="" id="form2Example3" />
              <label class="form-check-label" for="form2Example3">
                Remember me
              </label>
            </div>
            <a href="#!" class="text-body">Forgot password?</a>
          </div> -->
          
          <div class="text-center text-lg-start mt-4 pt-2">
            <button type="button" class="btn btn-primary btn-lg"
            style="padding-left: 2.5rem; padding-right: 2.5rem;">Login</button>
            <p class="small fw-bold mt-5 pt-1 mb-0 text-white">Tidak mempunyai akun? <a href="/register"
              class="link-danger">Daftar di sini</a></p>
            </div>
              
          </div>
            </form>
        </div>
      </div>
    </div>
  </div>
</div>
</template>
  
  <script>
  export default {
      name: 'LoginComponents',
      props: {

    }
  }
  </script>
  
  <style>
  * {
  margin: 0;
  padding: 0;
}
  #bg {
    width: 100vw;
    height: 100vh;
    background-color: #5865f2;
  }
  #borderlogin{
    margin-left: 50px;
    width: 420px;
    height: 450px;
    background-color: #36393f;
  }
  /* #pktp{
    width: 50%;
    height: auto;
  } */

  </style>
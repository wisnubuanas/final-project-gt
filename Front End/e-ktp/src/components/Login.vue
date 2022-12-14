<template>
<div class="d-flex flex-center p-5">
  <div class="container-fluid h-custom p-5">
    <div class="row d-flex justify-content-center align-items-center h-100">
      <div class="col-md-9 col-lg-6 col-xl-5">
        <img src="https://cdnmadukara.purwakartakab.go.id/cdn/v1/assets/upload/logo/mpp.purwakartakab.go.id/2021/05/910edbd65896d740da7d96628e1f532d_medium_small.png"
          class="img-fluid" alt="Sample image">
      </div>
      <div class="col-md-8 col-lg-6 col-xl-4 offset-xl-1">
        <form>
            <h2 class="d-flex justify-content-center mb-4">Selamat Datang !</h2>
          <!-- Email input -->
          <div class="form-outline mb-2">
            <input type="email" id="form3Example3" class="form-control form-control-lg"
              placeholder="Email" />
            <label class="form-label" for="form3Example3"> </label>
          </div>

          <!-- Password input -->
          <div class="form-outline mb-2">
            <input type="password" id="form3Example4" class="form-control form-control-lg"
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
            <p class="small fw-bold mt-2 pt-1 mb-0">Tidak mempunyai akun? <a href="#!"
                class="link-danger">Daftar di sini</a></p>
          </div>

        </form>
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
  /* #Navbar {
      text-align: center;
  } */
  </style>
<?php

use App\Http\Controllers\LoginController;
use Illuminate\Routing\RouteRegistrar;
use Illuminate\Support\Facades\Route;

Route::get('/', function () {
    return view('home');
});

Route::get('/login',([LoginController::class,'login']))->name('login');

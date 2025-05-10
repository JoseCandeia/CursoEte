<?php

use App\Http\Controllers\LogarController;
use Illuminate\Support\Facades\Route;

Route::get('/',[LogarController::class, 'logar' ]);

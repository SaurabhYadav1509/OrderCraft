export interface User {
  id: number;
  fullName: string;
  email: string;
  role: 'ADMIN' | 'USER';
}

export interface LoginRequest {
  email: string;
  password: string;
}

export interface SignupRequest {
  fullName: string;
  email: string;
  password: string;
  confirmPassword?: string;
}

export interface AuthResponse {
  id: number;
  fullName: string;
  email: string;
  role: 'ADMIN' | 'USER';
}

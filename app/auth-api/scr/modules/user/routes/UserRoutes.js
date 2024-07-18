import { Router } from "express";

import UserController from "../controller/UserController.js";
import checkToken from "../../../config/auth/checkToken.js";

const router = new Router();

//Endpoint público
router.post("/api/user/auth", UserController.getAccessToken);

// Endoints privados, abaixo do checkToken
router.use(checkToken);

// /api/user/email/leoviana@gmail.com
router.get("/api/user/email/:email", UserController.findByEmail);


export default router;

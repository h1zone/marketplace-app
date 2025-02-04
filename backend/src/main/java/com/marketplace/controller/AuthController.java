@RestController
@RequestMapping("/api")
public class AuthController {

    @PostMapping("/login")
    public ResponseEntity<?> login(@RequestBody LoginRequest loginRequest) {
        // Логика аутентификации
        return ResponseEntity.ok().body(Map.of("success", true));
    }
}
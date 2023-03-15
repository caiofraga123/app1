package cintra.coelho.fraga.caio;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.widget.EditText;
import android.widget.TextView;

public class NextActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.actvity_next);
        Intent intent = getIntent();
        String textoArmzenado = intent.getStringExtra("texto");
        TextView tvExibir = findViewById(R.id.tvExibir);
        tvExibir.setText(textoArmzenado);
    }
}
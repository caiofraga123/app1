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
        //Declaração de uma intenççao com a função de pegar uma intenção
        Intent intent = getIntent();
        //Declaração de uma string virá da intenção onde tiver a o dicionário com a chave texto
        String textoArmzenado = intent.getStringExtra("texto");
        //Declaração de TextView que corresponderá ao id
        TextView tvExibir = findViewById(R.id.tvExibir);
        //Declaração de colocar no TextView o textoArmazenado
        tvExibir.setText(textoArmzenado);
    }
}
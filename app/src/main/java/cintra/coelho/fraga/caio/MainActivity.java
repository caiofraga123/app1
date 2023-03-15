package cintra.coelho.fraga.caio;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        //Declaração de um botão que corresponde ao id referenciado. Este botão está no arquivo xml
        Button btnEnviar = findViewById(R.id.btnEnviar);
        //Declaração que define qual é o OnClickListener que chama o callback
        btnEnviar.setOnClickListener(new View.OnClickListener() {
            @Override
            //Callback que contém função que define o que acontece ao clicar no botão
            public void onClick(View view) {
                //Declaração de um campo de texto que corresponde ao id referenciado. Este botão está no arquivo xml
                EditText etDigiteAqui = findViewById(R.id.etDigiteAqui);
                //Declaração de String que receberá o texto do campo de texto etDigiteAqui
                String textoDigitado = etDigiteAqui.getText().toString();
                //Declaração de intenção que levará conteúdo de uma página referenciada para outra
                Intent intent = new Intent(MainActivity.this, NextActivity.class);
                //Declaração de dicionário que conterá a uma chave e um item que será o textoDigitado
                intent.putExtra("texto", textoDigitado);
                //Executa a intenção
                startActivity(intent);
            }
        });
    }
}
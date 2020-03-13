package id.ac.polinema.recyclerview;

import android.os.Bundle;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.GridLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import java.util.ArrayList;
import java.util.List;

import id.ac.polinema.recyclerview.adapters.GridAdapter;
import id.ac.polinema.recyclerview.models.TeamLogo;

public class GridActivity extends AppCompatActivity {

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_grid);

		RecyclerView teamsView = findViewById(R.id.rv_teams);

		List<TeamLogo> teams = new ArrayList<>();
		teams.add(new TeamLogo("https://upload.wikimedia.org/wikipedia/en/thumb/0/0c/Liverpool_FC.svg/360px-Liverpool_FC.svg.png", "Liverpool"));
		teams.add(new TeamLogo("https://upload.wikimedia.org/wikipedia/en/thumb/e/eb/Manchester_City_FC_badge.svg/360px-Manchester_City_FC_badge.svg.png", "Man. City"));
		teams.add(new TeamLogo("https://upload.wikimedia.org/wikipedia/id/thumb/8/83/Logo_PSSI.png/150px-Logo_PSSI.png", "PSSI"));
        teams.add(new TeamLogo("https://upload.wikimedia.org/wikipedia/en/thumb/5/56/Real_Madrid_CF.svg/1200px-Real_Madrid_CF.svg.png", "Real Madrid"));

		GridAdapter adapter = new GridAdapter(this, teams);
		teamsView.setAdapter(adapter);

		RecyclerView.LayoutManager layoutManager = new GridLayoutManager(this, 2);
		teamsView.setLayoutManager(layoutManager);
	}
}

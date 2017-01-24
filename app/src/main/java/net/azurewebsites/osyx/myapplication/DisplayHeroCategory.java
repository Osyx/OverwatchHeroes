package net.azurewebsites.osyx.myapplication;

import android.content.Intent;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentPagerAdapter;
import android.support.v4.view.ViewPager;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

public class DisplayHeroCategory extends AppCompatActivity {

    public static String CURRENT_PAGE_TITLE = "Nope!";
    public static String PREVIOUS_PAGE_TITLE = "Nope!";
    public static int REPEATED_HERO = 0;
    public String HERO_CATEGORY = "All";
    /**
     * The {@link android.support.v4.view.PagerAdapter} that will provide
     * fragments for each of the sections. We use a
     * {@link FragmentPagerAdapter} derivative, which will keep every
     * loaded fragment in memory. If this becomes too memory intensive, it
     * may be best to switch to a
     * {@link android.support.v4.app.FragmentStatePagerAdapter}.
     */
    private SectionsPagerAdapter mSectionsPagerAdapter;

    /**
     * The {@link ViewPager} that will host the section contents.
     */
    private ViewPager mViewPager;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_display_hero_category);

        Intent intent = getIntent();
        this.HERO_CATEGORY = intent.getStringExtra(MainActivity.EXTRA_MESSAGE);

        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
        toolbar.setTitle(this.HERO_CATEGORY);
        setSupportActionBar(toolbar);
        // Create the adapter that will return a fragment for each of the three
        // primary sections of the activity.
        mSectionsPagerAdapter = new SectionsPagerAdapter(getSupportFragmentManager());

        // Set up the ViewPager with the sections adapter.
        mViewPager = (ViewPager) findViewById(R.id.container);
        mViewPager.setAdapter(mSectionsPagerAdapter);
    }


    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.menu_display_hero_category, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        // Handle action bar item clicks here. The action bar will
        // automatically handle clicks on the Home/Up button, so long
        // as you specify a parent activity in AndroidManifest.xml.
        int id = item.getItemId();

        //noinspection SimplifiableIfStatement
        if (id == R.id.action_settings) {
            return true;
        }

        return super.onOptionsItemSelected(item);
    }

    /**
     * A placeholder fragment containing a simple view.
     */
    public static class PlaceholderFragment extends Fragment {
        /**
         * The fragment argument representing the section number for this
         * fragment.
         */
        private static final String ARG_SECTION_NUMBER = "section_number";

        public PlaceholderFragment() {
        }

        /**
         * Returns a new instance of this fragment for the given section
         * number.
         */
        public static PlaceholderFragment newInstance(int sectionNumber) {
            PlaceholderFragment fragment = new PlaceholderFragment();
            Bundle args = new Bundle();
            args.putInt(ARG_SECTION_NUMBER, sectionNumber);
            fragment.setArguments(args);
            return fragment;
        }

        @Override
        public View onCreateView(LayoutInflater inflater, ViewGroup container,
                                 Bundle savedInstanceState) {
            View rootView = inflater.inflate(R.layout.fragment_display_hero_category, container, false);
            TextView textView = (TextView) rootView.findViewById(R.id.section_label);
            ImageView imageView = (ImageView) rootView.findViewById(R.id.imgHeroSelect);
            Log.d("onCreateView ", " " + CURRENT_PAGE_TITLE);
            if (REPEATED_HERO == 0) {
                textView.setText(getString(R.string.section_format, PREVIOUS_PAGE_TITLE));
                changeCharacterImage(PREVIOUS_PAGE_TITLE, imageView);
                REPEATED_HERO++;
            } else {
                textView.setText(getString(R.string.section_format, CURRENT_PAGE_TITLE));
                changeCharacterImage(CURRENT_PAGE_TITLE, imageView);
            }

            return rootView;
        }

        public void changeCharacterImage(String hero, ImageView imageView) {
            switch (hero) {
                case "Genji":
                    imageView.setImageResource(R.drawable.genji_portrait);
                    break;
                case "McCree":
                    imageView.setImageResource(R.drawable.mccree_portrait);
                    break;
                case "Pharah":
                    imageView.setImageResource(R.drawable.pharah_portrait);
                    break;
                case "Reaper":
                    imageView.setImageResource(R.drawable.reaper_portrait);
                    break;
                case "Soldier:76":
                    imageView.setImageResource(R.drawable.soldier76_portrait);
                    break;
                case "Sombra":
                    imageView.setImageResource(R.drawable.sombra_portrait);
                    break;
                case "Tracer":
                    imageView.setImageResource(R.drawable.tracer_portrait);
                    break;
                case "Bastion":
                    imageView.setImageResource(R.drawable.bastion_portrait);
                    break;
                case "Hanzo":
                    imageView.setImageResource(R.drawable.hanzo_portrait);
                    break;
                case "Junkrat":
                    imageView.setImageResource(R.drawable.junkrat_portrait);
                    break;
                case "Mei":
                    imageView.setImageResource(R.drawable.mei_portrait);
                    break;
                case "Torbjörn":
                    imageView.setImageResource(R.drawable.torbjorn_portrait);
                    break;
                case "Widowmaker":
                    imageView.setImageResource(R.drawable.widowmaker_portrait);
                    break;
                case "D.Va":
                    imageView.setImageResource(R.drawable.dva_portrait);
                    break;
                case "Reinhardt":
                    imageView.setImageResource(R.drawable.reinhardt_portrait);
                    break;
                case "Roadhog":
                    imageView.setImageResource(R.drawable.roadhog_portrait);
                    break;
                case "Winston":
                    imageView.setImageResource(R.drawable.winston_portrait);
                    break;
                case "Zarya":
                    imageView.setImageResource(R.drawable.zarya_portrait);
                    break;
                case "Ana":
                    imageView.setImageResource(R.drawable.ana_portrait);
                    break;
                case "Lucio":
                    imageView.setImageResource(R.drawable.lucio_portrait);
                    break;
                case "Mercy":
                    imageView.setImageResource(R.drawable.mercy_portrait);
                    break;
                case "Symmetra":
                    imageView.setImageResource(R.drawable.symmetra_portrait);
                    break;
                case "Zenyatta":
                    imageView.setImageResource(R.drawable.zenyatta_portrait);
                    break;
                default:
                    imageView.setImageResource(R.drawable.zenyatta_portrait);
            }

        }
    }

    /**
     * A {@link FragmentPagerAdapter} that returns a fragment corresponding to
     * one of the sections/tabs/pages.
     */
    public class SectionsPagerAdapter extends FragmentPagerAdapter {

        public SectionsPagerAdapter(FragmentManager fm) {
            super(fm);
        }

        @Override
        public Fragment getItem(int position) {
            // getItem is called to instantiate the fragment for the given page.
            // Return a PlaceholderFragment (defined as a static inner class below).
            if (position == 0) {
                PREVIOUS_PAGE_TITLE = getPageTitle(position).toString();
                REPEATED_HERO = 0;
            } else {
                CURRENT_PAGE_TITLE = getPageTitle(position).toString();
            }
            Log.d("position", " " + position);
            return PlaceholderFragment.newInstance(position + 1);
        }

        @Override
        public int getCount() {
            if (HERO_CATEGORY.equals("Offense"))
                return 7;
            if (HERO_CATEGORY.equals("Defense"))
                return 6;
            if (HERO_CATEGORY.equals("Tank"))
                return 5;
            if (HERO_CATEGORY.equals("Support"))
                return 5;

            return 23;
        }

        @Override
        public CharSequence getPageTitle(int position) {
            if (HERO_CATEGORY.equals("Offense")) {
                switch (position) {
                    case 0:
                        return "Genji";
                    case 1:
                        return "McCree";
                    case 2:
                        return "Pharah";
                    case 3:
                        return "Reaper";
                    case 4:
                        return "Soldier:76";
                    case 5:
                        return "Sombra";
                    case 6:
                        return "Tracer";
                }
            }
            if (HERO_CATEGORY.equals("Defense")) {
                switch (position) {
                    case 0:
                        return "Bastion";
                    case 1:
                        return "Hanzo";
                    case 2:
                        return "Junkrat";
                    case 3:
                        return "Mei";
                    case 4:
                        return "Torbjörn";
                    case 5:
                        return "Widowmaker";
                }
            }
            if (HERO_CATEGORY.equals("Tank")) {
                switch (position) {
                    case 0:
                        return "D.Va";
                    case 1:
                        return "Reinhardt";
                    case 2:
                        return "Roadhog";
                    case 3:
                        return "Winston";
                    case 4:
                        return "Zarya";
                }
            }
            if (HERO_CATEGORY.equals("Support")) {
                switch (position) {
                    case 0:
                        return "Ana";
                    case 1:
                        return "Lucio";
                    case 2:
                        return "Mercy";
                    case 3:
                        return "Symmetra";
                    case 4:
                        return "Zenyatta";
                }
            }

            switch (position) {
                case 0:
                    return "Genji";
                case 1:
                    return "McCree";
                case 2:
                    return "Pharah";
                case 3:
                    return "Reaper";
                case 4:
                    return "Soldier:76";
                case 5:
                    return "Sombra";
                case 6:
                    return "Tracer";
                case 7:
                    return "Bastion";
                case 8:
                    return "Hanzo";
                case 9:
                    return "Junkrat";
                case 10:
                    return "Mei";
                case 11:
                    return "Torbjörn";
                case 12:
                    return "Widowmaker";
                case 13:
                    return "D.Va";
                case 14:
                    return "Reinhardt";
                case 15:
                    return "Roadhog";
                case 16:
                    return "Winston";
                case 17:
                    return "Zarya";
                case 18:
                    return "Ana";
                case 19:
                    return "Lucio";
                case 20:
                    return "Mercy";
                case 21:
                    return "Symmetra";
                case 22:
                    return "Zenyatta";
            }
            return "No hero";
        }

        public void setTitle(int position) {
            CURRENT_PAGE_TITLE = getPageTitle(position).toString();
        }
    }
}

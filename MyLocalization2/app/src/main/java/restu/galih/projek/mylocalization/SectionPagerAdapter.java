package restu.galih.projek.mylocalization;

import android.content.Context;

import androidx.annotation.Nullable;
import androidx.appcompat.widget.SwitchCompat;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.FragmentPagerAdapter;

import com.google.android.material.appbar.AppBarLayout;

public class SectionPagerAdapter extends FragmentPagerAdapter {
    private final Context mContext;
    public SectionPagerAdapter(Context context, FragmentManager fm) {
        super(fm);
        mContext= context;
    }
    private final int[] TAB_TITLES = new int[]{
            R.string.tab_text1,
            R.string.tab_text2
    };


    @Override
    public Fragment getItem(int position) {
        Fragment fragment = null;
        switch (position){
            case 0:
            fragment = new HomeFragment();
            break;

            case 1:
            fragment = new ProfileFragment();
            break;
        }
        return fragment;
    }
    @Nullable
    @Override
    public CharSequence getPageTitle(int position){
        return
                mContext.getResources().getString(TAB_TITLES[position]);
        }
    @Override
    public int getCount() {
        return 2;
    }
}

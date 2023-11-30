-- | printing a tree in haskell
-- | (c) 2023 <fdrees@uni-bremen.de> - WTFPL
-- | Do What the Fuck You Want to Public License

f :: Int -> [Char]
f x = unlines (take x [g (x - 1 - div n 2) " " ++ g n "X" | n <- [1,3..]]) ++ g (x-1) " " ++ "I"
    where
        g a b = concat $ replicate a b

main :: IO ()
main = do
    putStrLn  $ f 8

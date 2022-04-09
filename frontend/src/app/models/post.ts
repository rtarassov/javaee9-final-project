export interface Post {
  id: number;
  header: string,
  content: string,
  author: string,
  creationTimestamp: string, // TODO: change to Date later
  updateTimestamp: string
}
